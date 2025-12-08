package ksyun.client.kec.deletedataguardgroups.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteDataGuardGroupsRequest
* @Description 请求参数
*/
@Data
public class DeleteDataGuardGroupsRequest{
    /**待删除的容灾分组ID*/
    @KsYunField(name="DataGuardId",type=2)
    private List<String> DataGuardIdList;

}
