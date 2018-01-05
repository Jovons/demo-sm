package com.example.demosm.my.jpa;

import lombok.Getter;

/**
 * GRP_ must belong to group members, PRV_ must belong to province members.
 * And in PRD it matches all the "集团级XXX"
 * Those with neither could belong to any one, or even CP (customer).
 *
 * Created by wensi on 2017-07-12.
 */
@Getter
public enum AuthorityEnum {
    GRP_CP("集团级CP管理", null),
    GRP_CP_CUD("CP创建/编辑/删除", "GRP_CP"),
    GRP_CP_INFO("CP信息编辑", "GRP_CP"),
    GRP_CP_SWITCH("CP激活/禁用", "GRP_CP"),
    GRP_CP_ENROLL("集团级CP注册审核", "GRP_CP"),
    GRP_CP_DOMAIN("域名审核", "GRP_CP"),
    GRP_CP_BBOSS("集团级BBOSS工单处理", "GRP_CP"),
    GRP_CP_ENROLL_PASS("通过", "GRP_CP_ENROLL"),
    GRP_CP_ENROLL_FAIL("不通过", "GRP_CP_ENROLL"),
    GRP_CP_DOMAIN_PASS("通过", "GRP_CP_DOMAIN"),
    GRP_CP_DOMAIN_FAIL("不通过", "GRP_CP_DOMAIN"),

    GRP_CONTENT("集团级CP内容管理",null),
    GRP_CONTENT_C("内容注入（代企业）","GRP_CONTENT"),
    GRP_CONTENT_U("内容更新（代企业）","GRP_CONTENT"),
    GRP_CONTENT_D("内容删除","GRP_CONTENT"),

    LOG("CP日志配置",null),
    LOG_CONFIG("日志输出配置", "LOG"),
    LOG_CONFIG_VIEW("日志输出配置记录查询", "LOG"),

    GRP_KPI("集团级CP运营指标查看",null),
    GRP_KPI_BW("带宽数据（分企业维度和域名维度）","GRP_KPI"),
    GRP_KPI_TRAFFIC("流量数据（分企业维度和域名维度）","GRP_KPI"),
    GRP_KPI_REQ("请求数数据（分企业维度和域名维度）","GRP_KPI"),
    GRP_KPI_CORP("企业情况","GRP_KPI"),
    GRP_KPI_DOMAIN("域名列表","GRP_KPI"),
    GRP_KPI_DELETE_DOMAIN("域名删除列表","GRP_KPI"),


    GRP_PROP("集团级资产管理",null),
    GRP_PROP_HOUSE("机房资产查看","GRP_PROP"),
    GRP_PROP_HOST("服务器资产查看","GRP_PROP"),

    GRP_RSRC("集团级资源管理",null),
    GRP_RSRC_NODE("节点资源查看","GRP_RSRC"),
    GRP_RSRC_HOST("主机资源查看","GRP_RSRC"),
    GRP_RSRC_GROUP("主机组资源查看","GRP_RSRC"),
    GRP_RSRC_CONFIG("配置信息查看","GRP_RSRC"),

    GRP_ALERT("集团级告警配置/管理",null),
    GRP_ALERT_CUD("告警指标新增/编辑/删除","GRP_ALERT"),
    GRP_ALERT_VIEW("告警工单查看","GRP_ALERT"),
    GRP_ALERT_FORWARD("告警工单流转（暂无该内容）","GRP_ALERT"),

    GRP_MON("集团级系统/业务监控指标查看",null),
    GRP_MON_SYS("系统监控","GRP_MON"),
    GRP_MON_SVC("业务监控","GRP_MON"),
    GRP_MON_SYS_HOST("主机监控报表","GRP_MON_SYS"),
    GRP_MON_SYS_CPU("CPU监控报表","GRP_MON_SYS"),
    GRP_MON_SYS_DISK("磁盘监控报表","GRP_MON_SYS"),
    GRP_MON_SYS_NET("网卡监控报表","GRP_MON_SYS"),
    GRP_MON_SYS_MEM("内存监控报表","GRP_MON_SYS"),
    GRP_MON_SYS_SYS("系统监控概况","GRP_MON_SYS"),
    GRP_MON_SVC_TRAFFIC("流量监控报表","GRP_MON_SVC"),
    GRP_MON_SVC_SPEED("速率监控报表","GRP_MON_SVC"),
    GRP_MON_SVC_SVCREQ("业务请求监控报表","GRP_MON_SVC"),
    GRP_MON_SVC_ORIREQ("回源请求监控报表","GRP_MON_SVC"),
    GRP_MON_SVC_SVC("业务监控概况","GRP_MON_SVC"),

    GRP_SCHED("集团级调度配置管理",null),
    GRP_SCHED_POLICY("调度策略配置","GRP_SCHED"),
    GRP_SCHED_DOMAIN("域名调度策略配置","GRP_SCHED"),

    GRP_AUTH("角色及权限分配", null),
    GRP_AUTH_SA("创建/编辑/删除/激活/禁用集团级业务管理员及权限分配", "GRP_AUTH"),
    GRP_AUTH_IT("创建/编辑/删除/激活/禁用集团级运维管理员及权限分配", "GRP_AUTH"),

    CONFIG_MNG("配置管理", null),
    CONFIG_MNG_HOST("主机管理", "CONFIG_MNG"),

    CP_INFO("用户中心", null),
    CP_PRD("某产品", null),
    CP_CONTENT("内容管理", null),
    CP_PRD_CONFIG("自助配置", "CP_PRD"),
    CP_PRD_DATA("数据通知", "CP_PRD"),
    CP_PRD_DATA_BW("带宽", "CP_PRD_DATA"),
    CP_PRD_DATA_TRAFFIC("流量", "CP_PRD_DATA"),
    CP_PRD_DATA_REQ("请求数", "CP_PRD_DATA"),

    CP_CONTENT_C("内容注入", "CP_CONTENT"),
    CP_CONTENT_U("内容更新", "CP_CONTENT"),
    CP_CONTENT_D("内容删除", "CP_CONTENT"),

    OPERATOR_LOG("查看操作日志", null),
    DASHBOARD("首页", null),

    /**
     *
     */
    PRV_CP("省级CP管理", null),
    PRV_CP_CUD("CP创建/编辑/删除", "PRV_CP"),
    PRV_CP_INFO("CP信息编辑", "PRV_CP"),
    PRV_CP_SWITCH("CP激活/禁用", "PRV_CP"),
    PRV_CP_ENROLL("省级CP注册审核", "PRV_CP"),
    PRV_CP_DOMAIN("域名审核", "PRV_CP"),
    PRV_CP_ENROLL_PASS("通过", "PRV_CP_ENROLL"),
    PRV_CP_ENROLL_FAIL("不通过", "PRV_CP_ENROLL"),
    PRV_CP_DOMAIN_PASS("通过", "PRV_CP_DOMAIN"),
    PRV_CP_DOMAIN_FAIL("不通过", "PRV_CP_DOMAIN"),

    PRV_CONTENT("省级CP内容管理",null),
    PRV_CONTENT_C("内容注入（代企业）","PRV_CONTENT"),
    PRV_CONTENT_U("内容更新（代企业）","PRV_CONTENT"),
    PRV_CONTENT_D("内容删除","PRV_CONTENT"),

    PRV_KPI("省级CP运营指标查看",null),
    PRV_KPI_BW("带宽数据（分企业维度和域名维度）","PRV_KPI"),
    PRV_KPI_TRAFFIC("流量数据（分企业维度和域名维度）","PRV_KPI"),
    PRV_KPI_REQ("请求数数据（分企业维度和域名维度）","PRV_KPI"),
    PRV_KPI_CORP("企业情况","PRV_KPI"),
    PRV_KPI_DOMAIN("域名列表","PRV_KPI"),
    PRV_KPI_DELETE_DOMAIN("域名删除列表","PRV_KPI"),

    PRV_PROP("省级资产管理",null),
    PRV_PROP_HOUSE("机房资产查看、新增、删除、修改","PRV_PROP"),
    PRV_PROP_HOST("服务器资产查看、新增、删除、修改","PRV_PROP"),

    PRV_RSRC("省级资源管理",null),
    PRV_RSRC_NODE("节点资源查看（运维系统上报）","PRV_RSRC"),
    PRV_RSRC_HOST("主机资源查看（运维系统上报）","PRV_RSRC"),
    PRV_RSRC_GROUP("主机组资源查看（运维系统上报）","PRV_RSRC"),
    PRV_RSRC_CONFIG("配置信息查看（运维系统上报）","PRV_RSRC"),

    PRV_ALERT("省级告警配置/管理",null),
    PRV_ALERT_CUD("告警指标新增/编辑/删除","PRV_ALERT"),
    PRV_ALERT_VIEW("告警工单查看","PRV_ALERT"),
    PRV_ALERT_FORWARD("告警工单流转（暂无该内容）","PRV_ALERT"),

    PRV_MON("省级系统/业务监控指标查看",null),
    PRV_MON_SYS("系统监控","PRV_MON"),
    PRV_MON_SVC("业务监控","PRV_MON"),
    PRV_MON_SYS_HOST("主机监控报表","PRV_MON_SYS"),
    PRV_MON_SYS_CPU("CPU监控报表","PRV_MON_SYS"),
    PRV_MON_SYS_DISK("磁盘监控报表","PRV_MON_SYS"),
    PRV_MON_SYS_NET("网卡监控报表","PRV_MON_SYS"),
    PRV_MON_SYS_MEM("内存监控报表","PRV_MON_SYS"),
    PRV_MON_SYS_SYS("系统监控概况","PRV_MON_SYS"),
    PRV_MON_SVC_TRAFFIC("流量监控报表","PRV_MON_SVC"),
    PRV_MON_SVC_SPEED("速率监控报表","PRV_MON_SVC"),
    PRV_MON_SVC_SVCREQ("业务请求监控报表","PRV_MON_SVC"),
    PRV_MON_SVC_ORIREQ("回源请求监控报表","PRV_MON_SVC"),
    PRV_MON_SVC_SVC("业务监控概况","PRV_MON_SVC"),

    PRV_SCHED("省级调度配置管理",null),
    PRV_SCHED_POLICY("调度策略配置","PRV_SCHED"),
    PRV_SCHED_DOMAIN("域名调度策略配置","PRV_SCHED"),

    GRP_BS("BBOSS订单",null),
    GRP_BS_EVALUATE("商机评估订单", "GRP_BS"),
    GRP_BS_TRY("试用订单", "GRP_BS"),
    GRP_BS_ACCEPT("业务受理订单", "GRP_BS"),
    GRP_BS_ALTER("业务变更订单","GRP_BS"),
    GRP_BS_SR("业务暂停/恢复订单","GRP_BS"),
    GRP_BS_SUSPEND("业务注销订单","GRP_BS"),
    GRP_BS_TBD("BBOSS订单权限待分配","GRP_BS"),

    GRP_AUTH_BS("创建/编辑/删除/激活/禁用集团级BBOSS组长和组员及权限分配", "GRP_AUTH"),
        ;

    private final String description;
    private final String parent;

    AuthorityEnum(String description, String parent) {
        this.description = description;
        this.parent = parent;
    }
    public AuthorityEnum getParentEnum() {
        return AuthorityEnum.valueOf(this.parent);
    }
}
