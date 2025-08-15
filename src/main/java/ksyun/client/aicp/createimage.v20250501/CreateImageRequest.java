package ksyun.client.aicp.createimage.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateImageRequest @Description 请求参数
 */
@Data
public class CreateImageRequest {
  /** 镜像名称 */
  @KsYunField(name = "image_name")
  private String Image_name;

  /** 镜像URL */
  @KsYunField(name = "image_url")
  private String Image_url;

  /** 镜像类型。 枚举值:container, training */
  @KsYunField(name = "image_type")
  private String Image_type;

  /** 描述 */
  @KsYunField(name = "description")
  private String Description;

  /** 镜像仓库地址，如果镜像来源于外部镜像仓库，需要填写仓库地址以及对应的账户密码。如果是平台自身托管的镜像仓库则不需要填写。 */
  @KsYunField(name = "mirror_addr")
  private String Mirror_addr;

  /** 镜像仓库的账户名称，当用户指定了mirror_addr后使用 */
  @KsYunField(name = "user")
  private String User;

  /** 镜像仓库的账户密码，请传入base64编码后的值 */
  @KsYunField(name = "secret")
  private String Secret;

  /** 是否同步镜像到平台，枚举值。registry：运行任务时拉取该镜像。 sync：注册后会将镜像同步到平台进行托管，运行任务时将拉取平台托管的镜像。 */
  @KsYunField(name = "op_type")
  private String Op_type;
}
