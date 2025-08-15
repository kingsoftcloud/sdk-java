package ksyun.client.kec.importimage.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname ImportImageRequest @Description 请求参数
 */
@Data
public class ImportImageRequest {
  /** 镜像名称。 2-64个字符，支持中文、字母、数字以及-_@#.字符 */
  @KsYunField(name = "ImageName")
  private String ImageName;

  /** 系统架构。 i386，x86_64 */
  @KsYunField(name = "Architecture")
  private String Architecture;

  /**
   * 操作系统版本。 centos：centos-5<br>
   * centos-6<br>
   * centos-7 <br>
   * redhat：redhat-5<br>
   * redhat-6<br>
   * redhat7 <br>
   * ubuntu：ubuntu-12<br>
   * ubuntu-14<br>
   * ubuntu-16 <br>
   * debian：debian8/debian9 <br>
   * fedora：fedora-20 <br>
   * other linux：other-linux <br>
   * windows：windows-/server_2012_r2_datacenter_64_zh<br>
   * windows-server_2012_r2_datacenter_64_en<br>
   * windows-server_2008_r2_datacenter_64_zh<br>
   * windows-server_2008_r2_datacenter_64_en
   */
  @KsYunField(name = "Platform")
  private String Platform;

  /**
   * 存放镜像的ks3对应的bucket地址。[如何开通ks3?](https://docs.ksyun.com/documents/858)[如何获取bucket地址？](https://docs.ksyun.com/documents/27937?type=3)
   * http开头，有效的bucket地址
   */
  @KsYunField(name = "ImageUrl")
  private String ImageUrl;

  /** 选择上传的镜像格式。 raw、vhd、qcow2、vmdk */
  @KsYunField(name = "ImageFormat")
  private String ImageFormat;

  /** 存放数据盘镜像的ks3对应的bucket地址。 http开头，有效的bucket地址 */
  @KsYunField(name = "DataImageUrl")
  private List<String> DataImageUrlList;

  /** 数据盘磁盘容量。 2-64个字符，支持中文、字母、数字以及-_@#.字符 */
  @KsYunField(name = "DataImageSize")
  private List<String> DataImageSizeList;

  /** 选择上传的数据盘镜像格式。 raw */
  @KsYunField(name = "DataImageFormat")
  private List<String> DataImageFormatList;
}
