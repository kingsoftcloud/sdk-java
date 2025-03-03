package ksyun.client.kec.deletedataguardgroups.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DeleteDataGuardGroupsRequest
 * @Description 请求参数
 */
@Data
public class DeleteDataGuardGroupsRequest {
    /**
     * 待删除的容灾分组ID
     */
    @KsYunField(name = "DataGuardId")
    private List<String> DataGuardIdList;


}