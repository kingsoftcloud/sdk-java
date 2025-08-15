package ksyun.client.krds.setupproxyinstance.v20160701;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname SetUpProxyInstanceRequest @Description 请求参数
 */
@Data
public class SetUpProxyInstanceRequest {
  /** 代理实例ID */
  @KsYunField(name = "DBInstanceIdentifier")
  private String DBInstanceIdentifier;

  /** 只读实例列表 */
  @KsYunField(name = "ReadOnlyInstanceList")
  private List<ReadOnlyInstanceListDto> ReadOnlyInstanceListList;

  @Data
  @ToString
  public static class ReadOnlyInstanceListDto {
    /** 只读实例节点ID */
    @KsYunField(name = "Id")
    private String Id;

    /** 节点权重 */
    @KsYunField(name = "Weight")
    private Integer Weight;
  }
}
