package ksyun.client.kpfs.updateperformanceoneposixacl.v20240930;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname UpdatePerformanceOnePosixAclRequest @Description 请求参数
 */
@Data
public class UpdatePerformanceOnePosixAclRequest {
  /***/
  @KsYunField(name = "PosixAclId")
  private String PosixAclId;

  /***/
  @KsYunField(name = "FileSystemList", type = 2)
  private List<FileSystemListDto> FileSystemListList;

  @Data
  @ToString
  public static class FileSystemListDto {
    /***/
    private String FileSystemId;

    /***/
    private String VolumePath;
  }

  /***/
  @KsYunField(name = "Ips", type = 2)
  private List<String> IpsList;

  /***/
  @KsYunField(name = "AutoMount")
  private Boolean AutoMount;

  /***/
  @KsYunField(name = "Desc")
  private String Desc;
}
