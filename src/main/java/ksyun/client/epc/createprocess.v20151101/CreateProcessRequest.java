package ksyun.client.epc.createprocess.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateProcessRequest
 * @Description 请求参数
 */
@Data
public class CreateProcessRequest {
    /**
     * 云物理工单ID
     */
    @KsYunField(name = "ProcessId")
    private String ProcessId;

    /**
     * 实例ID
     */
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**云物理主机序列号*/
    @KsYunField(name="Sn")
    private String Sn;

    /**
     * 可用区
     */
    @KsYunField(name="AvailabilityZone")
    private String AvailabilityZone;

    /**创建时间*/
    @KsYunField(name="CreateTime")
    private String CreateTime;

    /**问题属性*/
    @KsYunField(name="Attribute")
    private String Attribute;

    /**描述*/
    @KsYunField(name = "Content")
    private String Content;

    /**服务器数量，通常填写1*/
    @KsYunField(name="MachineCount")
    private Integer MachineCount;

    /**标题*/
    @KsYunField(name = "Title")
    private String Title;

    /**操作类型,有效值:fix*/
    @KsYunField(name = "Type")
    private String Type;

    /**确认是否操作 有效值：0,1*/
    @KsYunField(name = "Confirm")
    private String Confirm;

    /**工单来源，0:客户 1：售后代提*/
    @KsYunField(name="ProcessSource")
    private Integer ProcessSource;

    /***/
    @KsYunField(name="autoNocCase")
    private Integer AutoNocCase;

    /**需要客户提供的文件名，需要带文件格式，需要与LogFile.N共同使用
     例如：test.csv、test.log*/
    @KsYunField(name="LogFileName")
    private List<String> LogFileNameList;

    /**工单日志文件，base64编码，需要与LogFileName.N共同使用
     E2LWQxOWU0ZWYwYjk2YSwwN2M4YThiZi0zMThmLTQxNjctYWVhNi1kMTllNGVmMGI5NmEsMjAyMC0wNS0xMiAyMTowNTo1NiwyMDIwLTA1LTEyIDIyOjU1OjQyLCJFUEPN0Lncv827p6Osv827p7j8u7u3/s7xxvfN+L+oo6zW2NDCyrax8E1BQ7Ki1tjG9Lf+zvHG96GjIiwsbnVsbCwsLCwKMjAwMDExNzcwMSwwMDkzNDU3UDIwMDdDMDAwNDIJLGNuLXNoYW5naGFpLTJhLM3QudxFUEO/zbuno6y4/Lu7zfi/qE1BQ7XY1re4/NDCsqLW2Mb0LLK7v8nS1NbYxvQszfi/qCwsLCwsLCw3OTg3YmVmOC0yNzY3LTRiZjktODdlMS01MjJkYjEwZTEyMGQs0tHN6rPJLDI1ZDk5ZDExLWQ0NTgtNDUyYy04ZWU5LTM1Yjk2MDIwNzcyNSwyNWQ5OWQxMS1kNDU4LTQ1MmMtOGVlOS0zNWI5NjAyMDc3MjUsMjAyMC0wNS0xMiAyMTowNTo1NiwyMDIwLTA1LTEyIDIyOjU1OjQyLCJFUEPN0Lncv827p6Osv827p7j8u7u3/s7xxvfN+L+oo6zW2NDCyrax8E1BQ7Ki1tjG9Lf+zvHG96GjIiwsbnVsbCwsLCwK
     大小：大小低于10MB*/
    @KsYunField(name="LogFile")
    private List<String> LogFileList;

    /**支持上传已授权给金山云的ks3的bucket的URL*/
    @KsYunField(name="LogUrl")
    private List<String> LogUrlList;

    /**
     * 是否允许换线0否1是
     */
    @KsYunField(name="AuthorizeCableReplace")
    private Integer AuthorizeCableReplace;

    /**事件ID*/
    @KsYunField(name="EventId")
    private String EventId;

}