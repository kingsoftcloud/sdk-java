package ksyun.client.monitor.getalertuser.v20210101;

import common.annotation.KsYunField;
import java.util.List;
import lombok.Data;

/**
 * @Classname GetAlertUserRequest @Description 请求参数
 */
@Data
public class GetAlertUserRequest {
  /**
   * 联系组ID，详见 [获取联系组](获取联系组)。
   *
   * <p>
   *
   * <p>> **说明：** 默认：表示全部； > **示例：** `UserGrpId.1=100&UserGrpId.2=101` (如果用户需要获取两个联系组的人员信息)
   */
  @KsYunField(name = "UserGrpId")
  private List<Integer> UserGrpId;
}
