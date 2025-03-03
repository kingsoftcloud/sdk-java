package ksyun.client.knad.deleteknad.v20230323;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteKnadRequest
 * @Description 请求参数
 */
@Data
public class DeleteKnadRequest {
    /***/
    @KsYunField(name = "KnadId")
    private String KnadId;

}