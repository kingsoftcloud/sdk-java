package ksyun.client.vpc.deletevpc.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteVpcRequest
 * @Description 请求参数
 */
@Data
public class DeleteVpcRequest {
    /**
     * Vpc的ID
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

}