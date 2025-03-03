package ksyun.client.cen.deletecengrant.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteCenGrantRequest
 * @Description 请求参数
 */
@Data
public class DeleteCenGrantRequest {
    /**
     * 云企业网授权的ID
     */
    @KsYunField(name = "CenGrantId")
    private String CenGrantId;


}