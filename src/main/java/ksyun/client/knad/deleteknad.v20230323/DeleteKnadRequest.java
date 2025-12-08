package ksyun.client.knad.deleteknad.v20230323;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteKnadRequest
* @Description 请求参数
*/
@Data
public class DeleteKnadRequest{
    /***/
    @KsYunField(name="KnadId")
    private String KnadId;

}
