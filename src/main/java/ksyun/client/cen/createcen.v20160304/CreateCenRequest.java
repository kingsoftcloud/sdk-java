package ksyun.client.cen.createcen.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateCenRequest
 * @Description 请求参数
 */
@Data
public class CreateCenRequest {
    /**
     * 云企业网的名称
     */
    @KsYunField(name = "CenName")
    private String CenName;

    /**
     * 云企业网的描述
     */
    @KsYunField(name = "Description")
    private String Description;

}