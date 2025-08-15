package ksyun.client.slb.setalbaccesslog.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname SetAlbAccessLogRequest @Description 请求参数
 */
@Data
public class SetAlbAccessLogRequest {
  /** 应用型负载均衡的ID */
  @KsYunField(name = "AlbId")
  private String AlbId;

  /** 访问日志投递的日志库 */
  @KsYunField(name = "ProjectName")
  private String ProjectName;

  /** 访问日志投递的日志池 */
  @KsYunField(name = "LogpoolName")
  private String LogpoolName;
}
