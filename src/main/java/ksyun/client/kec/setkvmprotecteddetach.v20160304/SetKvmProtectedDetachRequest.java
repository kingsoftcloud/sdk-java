package ksyun.client.kec.setkvmprotecteddetach.v20160304;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname SetKvmProtectedDetachRequest @Description 请求参数
 */
@Data
public class SetKvmProtectedDetachRequest {
  /** 伸缩组ID */
  @KsYunField(name = "ScalingGroupId")
  private String ScalingGroupId;

  /** 需设置移除保护的云服务器数组，下标从0开始 */
  @KsYunField(name = "ScalingInstanceId")
  private List<String> ScalingInstanceIdList;

  /** 移除保护标志位 1：设置云服务器移除保护；0：取消云服务器移除保护 */
  @KsYunField(name = "ProtectedFromDetach")
  private Integer ProtectedFromDetach;
}
