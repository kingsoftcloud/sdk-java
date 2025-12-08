package ksyun.client.vpc.deletednat.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteDnatRequest
* @Description 请求参数
*/
@Data
public class DeleteDnatRequest{
    /**Dnat的ID*/
    @KsYunField(name="DnatId")
    private String DnatId;

}
