package ksyun.client.monitor.getalertuser.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetAlertUserRequest
* @Description 请求参数
*/
@Data
public class GetAlertUserRequest{
    /**联系组ID，详见 [获取联系组](获取联系组)。


> **说明：** 默认：表示全部；
> **示例：** `UserGrpId.1=100&UserGrpId.2=101`
(如果用户需要获取两个联系组的人员信息)*/
    @KsYunField(name = "UserGrpId", type = 1)
    private List<Integer> UserGrpIdList;

}
