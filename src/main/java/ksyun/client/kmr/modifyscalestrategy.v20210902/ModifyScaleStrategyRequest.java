package ksyun.client.kmr.modifyscalestrategy.v20210902;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyScaleStrategyRequest
* @Description 请求参数
*/
@Data
public class ModifyScaleStrategyRequest{
    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;


}