package ksyun.client.kec.modifyinstanceautodeletetime.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname ModifyInstanceAutoDeleteTimeRequest @Description 请求参数
 */
@Data
public class ModifyInstanceAutoDeleteTimeRequest {
  /** 待重启实例ID列表，N的范围为1-100 */
  @KsYunField(name = "InstanceId")
  private List<String> InstanceIdList;

  /** 自动删除时间 */
  @KsYunField(name = "AutoDeleteTime")
  private String AutoDeleteTime;

  /** 随主机定时删除绑定的弹性IP，包年包月的弹性IP只解绑，不删除；只有AutoDeleteTime有效值生效时，该参数才生效 */
  @KsYunField(name = "AutoDeleteEip")
  private Boolean AutoDeleteEip;
}
