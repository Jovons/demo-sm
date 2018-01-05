package com.example.demosm.my.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.PersistenceException;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class AuthorityListener {
    private Logger log = LoggerFactory.getLogger(AuthorityListener.class);

    @PrePersist
    @PreUpdate
    public void setHierarchyAttributes(Authority entity) {
        final Authority parent = entity.getParent();

        // set level
        if (parent == null) {
            entity.setLevel((short) 0);
        } else {
            if (parent.getLevel() == null) {
                throw new PersistenceException("Parent entity must have level defined");
            }
            if (parent.getLevel() == Short.MAX_VALUE) {
                throw new PersistenceException("Maximum number of hierarchy levels reached - please restrict use of parent/level relationship for "
                    + entity.getClass());
            }
            entity.setLevel(Short.valueOf((short) (parent.getLevel().intValue() + 1)));
        }

        // set top
        if (parent == null) {
            entity.setTop(entity);
        } else {
            if (parent.getTop() == null) {
                throw new PersistenceException("Parent entity must have top defined");
            }
            entity.setTop(parent.getTop());
        }

        // set tree path
        try {
            if (parent != null) {
                String parentTreePath = StringUtils.isNotBlank(parent.getTreePath()) ? parent.getTreePath() : "";
                entity.setTreePath(parentTreePath + String.valueOf(parent.getId()) + ".");
            } else {
                entity.setTreePath(null);
            }
        } catch (UnsupportedOperationException uoe) {
            log.warn("{}", uoe);
        }
    }

    public static class StringUtils {

        public static boolean isNotBlank(final CharSequence cs) {
            return !isBlank(cs);
        }

        public static boolean isBlank(final CharSequence cs) {
            int strLen;
            if (cs == null || (strLen = cs.length()) == 0) {
                return true;
            }
            for (int i = 0; i < strLen; i++) {
                if (Character.isWhitespace(cs.charAt(i)) == false) {
                    return false;
                }
            }
            return true;
        }
    }
}
