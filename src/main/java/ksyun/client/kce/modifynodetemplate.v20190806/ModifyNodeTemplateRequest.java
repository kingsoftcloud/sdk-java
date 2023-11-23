package ksyun.client.kce.modifynodetemplate.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyNodeTemplateRequest
* @Description 请求参数
*/
@Data
public class ModifyNodeTemplateRequest{
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**节点池id*/
    @KsYunField(name="NodePoolId")
    private String NodePoolId;

    /**节点模板信息<br>注：不可修改计费方式、节点池所在vpc*/
    @KsYunField(name="NodeTemplate")


}