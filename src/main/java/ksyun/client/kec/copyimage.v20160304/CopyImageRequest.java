package ksyun.client.kec.copyimage.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname CopyImageRequest @Description 请求参数
 */
@Data
public class CopyImageRequest {
  /** 源自定义镜像的ID列表。 cc27b87a-b74c-4da8-93b0-33edce5399cf */
  @KsYunField(name = "ImageId")
  private List<String> ImageIdList;

  /** 复制到目标地域的列表。 =cn-beijing-6 */
  @KsYunField(name = "DestinationRegion")
  private List<String> DestinationRegionList;

  /** 复制后的镜像的名称，默认值：源镜像名称。 2-64个字符，支持中文、字母、数字以及-_@#.字符 */
  @KsYunField(name = "DestinationImageName")
  private String DestinationImageName;
}
