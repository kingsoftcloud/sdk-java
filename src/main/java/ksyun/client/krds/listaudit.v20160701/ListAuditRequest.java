package ksyun.client.krds.listaudit.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListAuditRequest
* @Description 请求参数
*/
@Data
public class ListAuditRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**根据SQL操作命令筛选结果		例如：SELECT/INSERT/LOGOUT/CALL 可组合查询,字段以`/`分开*/
    @KsYunField(name="AccessSqlStatement")
    private String AccessSqlStatement;

    /**根据访问SQL类型筛选结果		例如：DQL/DML;可组合查询,字段以`/`分开*/
    @KsYunField(name="AccessSqlLanguage")
    private String AccessSqlLanguage;

    /**根据访问数据库名称筛选结果		例如：products；可组合查询,字段以`/`分开*/
    @KsYunField(name="AccessDBName")
    private String AccessDBName;

    /**根据来源Ip筛选结果		例如：10.208.0.100；可组合查询,字段以`/`分开*/
    @KsYunField(name="SourceIp")
    private String SourceIp;

    /**根据登录用户名筛选结果		例如：rdsrepladmin；可组合查询,字段以`/`分开*/
    @KsYunField(name="AccessUsername")
    private String AccessUsername;

    /**查询开始时间		例如：2021-08-31 19:47:37；同查询结束时间一起填写*/
    @KsYunField(name="AuditBeginTime")
    private String AuditBeginTime;

    /**查询结束时间		例如：2021-08-31 19:47:37；同查询开始时间一起填写*/
    @KsYunField(name="AuditEndTime")
    private String AuditEndTime;

    /**执行结果		默认成功。0: 失败，1 成功；可组合查询,字段以`/`分开*/
    @KsYunField(name="RunResult")
    private String RunResult;

    /**SQL模糊查询		默认无；<br>注意:<br>1.以`/`为分隔符隔开,并在末尾追加`&`或者`*/
    @KsYunField(name="KeyWord")
    private String KeyWord;

    /**排序字段		例如：ExecTime；<br>注意：<br>支持且仅支持如下字段(支持小驼峰传参)：<br>Duration<br>RowSent<br>ExecTime*/
    @KsYunField(name="SortBy")
    private String SortBy;

    /**排序方式		默认按照ExecTime倒叙排序；1-正序 2-倒序*/
    @KsYunField(name="SortWay")
    private String SortWay;

    /**Offset，默认0		默认0*/
    @KsYunField(name="Marker")
    private String Marker;

    /**Limit，默认10		默认10，范围[10,10000]*/
    @KsYunField(name="MaxRecords")
    private String MaxRecords;


}