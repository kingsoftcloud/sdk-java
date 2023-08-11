package ksyun.client.klog.putlogs.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname PutLogsRequest
* @Description 请求参数
*/
@Data
public class PutLogsRequest{
    /**工程名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**日志池名称*/
    @KsYunField(name="LogPoolName")
    private String LogPoolName;

    /**描述*/
    @KsYunField(name="参数名称")
    private String 参数名称;

    /**日志时间*/
    @KsYunField(name="Time")
    private String Time;

    /**每个元素为一个content，详见Content字段说明*/
    @KsYunField(name="Contents")
    private String Contents;

    /**自定义key名称*/
    @KsYunField(name="Key")
    private String Key;

    /**自定义key对应的值*/
    @KsYunField(name="Value")
    private String Value;

    /**Log的列表，详见Log*/
    @KsYunField(name="Logs")
    private String Logs;

    /**日志的文件名*/
    @KsYunField(name="Filename")
    private String Filename;

    /**日志来源，可以填写机器的ip*/
    @KsYunField(name="Source")
    private String Source;


}