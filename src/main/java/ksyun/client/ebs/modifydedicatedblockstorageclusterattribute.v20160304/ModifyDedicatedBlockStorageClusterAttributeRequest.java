package ksyun.client.ebs.modifydedicatedblockstorageclusterattribute.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyDedicatedBlockStorageClusterAttributeRequest
 * @Description 请求参数
 */
@Data
public class ModifyDedicatedBlockStorageClusterAttributeRequest {
    /***/
    @KsYunField(name = "DbscId")
    private String DbscId;

    /***/
    @KsYunField(name = "DbscName")
    private String DbscName;

    /***/
    @KsYunField(name = "AvailabilityZone")
    private String AvailabilityZone;

    /***/
    @KsYunField(name = "DbscDesc")
    private String DbscDesc;

}