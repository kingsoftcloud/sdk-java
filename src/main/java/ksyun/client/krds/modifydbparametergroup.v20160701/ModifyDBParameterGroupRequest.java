package ksyun.client.krds.modifydbparametergroup.v20160701;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifyDBParameterGroupRequest @Description 请求参数
 */
@Data
public class ModifyDBParameterGroupRequest {
  /** 参数组ID */
  @KsYunField(name = "DBParameterGroupId")
  private String DBParameterGroupId;

  /** 参数名 参数名与参数值同时填写；参数组名-参数值/参数组名称/参数组描述，至少填写一项 */
  @KsYunField(name = "Parameters")
  private List<ParametersDto> ParametersList;

  @Data
  @ToString
  public static class ParametersDto {
    /** 参数名 参数名与参数值同时填写；参数组名-参数值/参数组名称/参数组描述，至少填写一项 */
    @KsYunField(name = "Name")
    private String Name;

    /** 参数值 参数名与参数值同时填写；参数组名-参数值/参数组名称/参数组描述，至少填写一项 */
    @KsYunField(name = "Value")
    private String Value;
  }

  /** 参数组名称 请勿修改实例唯一参数组；参数组名-参数值/参数组名称/参数组描述，至少填写一项 */
  @KsYunField(name = "DBParameterGroupName")
  private String DBParameterGroupName;

  /** 参数组描述 请勿修改实例唯一参数组；参数组名-参数值/参数组名称/参数组描述，至少填写一项 */
  @KsYunField(name = "Description")
  private String Description;
}
