package ksyun.client.epc.batchcreateprocess.v20151101;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname BatchCreateProcessRequest @Description 请求参数
 */
@Data
public class BatchCreateProcessRequest {
  /** 发起工单的实例ID */
  @KsYunField(name = "InstanceId")
  private List<String> InstanceIdList;

  /** 可用区 */
  @KsYunField(name = "AvailabilityZone")
  private String AvailabilityZone;

  /**
   * 问题属性 默认值：Other
   * 有效值：Move|DevicePort|Network|Disk|Memory|Cpu|Gpu|RaidCard|NetworkInterfaceCard|Other
   */
  @KsYunField(name = "Attribute")
  private String Attribute;

  /** 工单描述 */
  @KsYunField(name = "Content")
  private String Content;

  /** 需要客户提供的文件名，需要带文件格式，需要与LogFile.N共同使用 例如：test.csv、test.log */
  @KsYunField(name = "LogFileName")
  private List<String> LogFileNameList;

  /**
   * 工单日志文件，base64编码，需要与LogFileName.N共同使用
   * E2LWQxOWU0ZWYwYjk2YSwwN2M4YThiZi0zMThmLTQxNjctYWVhNi1kMTllNGVmMGI5NmEsMjAyMC0wNS0xMiAyMTowNTo1NiwyMDIwLTA1LTEyIDIyOjU1OjQyLCJFUEPN0Lncv827p6Osv827p7j8u7u3/s7xxvfN+L+oo6zW2NDCyrax8E1BQ7Ki1tjG9Lf+zvHG96GjIiwsbnVsbCwsLCwKMjAwMDExNzcwMSwwMDkzNDU3UDIwMDdDMDAwNDIJLGNuLXNoYW5naGFpLTJhLM3QudxFUEO/zbuno6y4/Lu7zfi/qE1BQ7XY1re4/NDCsqLW2Mb0LLK7v8nS1NbYxvQszfi/qCwsLCwsLCw3OTg3YmVmOC0yNzY3LTRiZjktODdlMS01MjJkYjEwZTEyMGQs0tHN6rPJLDI1ZDk5ZDExLWQ0NTgtNDUyYy04ZWU5LTM1Yjk2MDIwNzcyNSwyNWQ5OWQxMS1kNDU4LTQ1MmMtOGVlOS0zNWI5NjAyMDc3MjUsMjAyMC0wNS0xMiAyMTowNTo1NiwyMDIwLTA1LTEyIDIyOjU1OjQyLCJFUEPN0Lncv827p6Osv827p7j8u7u3/s7xxvfN+L+oo6zW2NDCyrax8E1BQ7Ki1tjG9Lf+zvHG96GjIiwsbnVsbCwsLCwK大小：大小低于100MB
   */
  @KsYunField(name = "LogFile")
  private List<String> LogFileList;

  /** 支持上传已授权给金山云的ks3的bucket的URL */
  @KsYunField(name = "LogUrl")
  private List<String> LogUrlList;

  /** 服务器数量，数量需与实例id数量一致，单次最大支持50个 默认值：1 */
  @KsYunField(name = "MachineCount")
  private Integer MachineCount;

  /** 工单标题 */
  @KsYunField(name = "Title")
  private String Title;

  /** 操作类型 有效值：fix */
  @KsYunField(name = "Type")
  private String Type;

  /** 确认是否重启 有效值：0禁止重启，1可以重启 */
  @KsYunField(name = "Confirm")
  private String Confirm;

  /** 工单来源，0：客户自己提 1：售后代提 默认值：0 */
  @KsYunField(name = "ProcessSource")
  private Integer ProcessSource;

  /** 是否自动发起NOC工单，0：不发起 1：发起 默认值：0 */
  @KsYunField(name = "AutoNocCase")
  private Integer AutoNocCase;
}
