package ksyun.client.epc.modifysosubnetattributes.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifySoSubnetAttributesRequest
 * @Description 请求参数
 */
@Data
public class ModifySoSubnetAttributesRequest {
    /**
     * 待修改信息的子网的ID。
     */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /**
     * 子网的名称。
     */
    @KsYunField(name = "SubnetName")
    private String SubnetName;

    /**
     * 子网的描述信息。
     */
    @KsYunField(name = "Description")
    private String Description;

}