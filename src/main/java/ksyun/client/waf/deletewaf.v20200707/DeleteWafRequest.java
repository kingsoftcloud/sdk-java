package ksyun.client.waf.deletewaf.v20200707;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteWafRequest
* @Description 请求参数
*/
@Data
public class DeleteWafRequest{
    /**Action*/
    @KsYunField(name="Action")
    private String Action;

}
