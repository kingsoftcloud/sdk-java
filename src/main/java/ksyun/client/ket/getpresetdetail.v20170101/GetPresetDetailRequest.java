package ksyun.client.ket.getpresetdetail.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GetPresetDetailRequest
 * @Description 请求参数
 */
@Data
public class GetPresetDetailRequest {
    /**
     * 客户的域名标识
     */
    @KsYunField(name = "UniqName")
    private String UniqName;

    /**
     * 客户的频道名
     */
    @KsYunField(name = "App")
    private String App;

    /**
     * 模板名称
     */
    @KsYunField(name = "Preset")
    private String Preset;

}