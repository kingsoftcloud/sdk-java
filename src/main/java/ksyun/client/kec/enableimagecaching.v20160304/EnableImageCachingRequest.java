package ksyun.client.kec.enableimagecaching.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname EnableImageCachingRequest @Description 请求参数
 */
@Data
public class EnableImageCachingRequest {
  /** 预热的镜像ID。 —— */
  @KsYunField(name = "ImageId")
  private List<String> ImageIdList;
}
