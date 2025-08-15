package ksyun.client.kec.describeimagesharepermission.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeImageSharePermissionRequest @Description 请求参数
 */
@Data
public class DescribeImageSharePermissionRequest {
  /** 共享的镜像ID。 标准UUID格式，形如^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$ */
  @KsYunField(name = "ImageId")
  private String ImageId;
}
