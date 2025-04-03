package ksyun.client.cen.deletecen.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteCenRequest
* @Description 请求参数
*/
@Data
public class DeleteCenRequest{
    /**云企业网的ID*/
    @KsYunField(name="CenId")
    private String CenId;

}