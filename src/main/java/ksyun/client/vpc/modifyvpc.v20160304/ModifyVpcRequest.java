package ksyun.client.vpc.modifyvpc.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyVpcRequest
 * @Description 请求参数
 */
@Data
public class ModifyVpcRequest {
    /**
     * Vpc的名称
     */
    @KsYunField(name = "VpcName")
    private String VpcName;

    /**
     * Vpc的ID
     */
    @KsYunField(name="VpcId")
    private String VpcId;

}