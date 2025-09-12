package ksyun.client.vpc.deletesubnet.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSubnetRequest
* @Description 请求参数
*/
@Data
public class DeleteSubnetRequest{
    /**子网的ID*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

}