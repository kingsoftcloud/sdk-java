package ksyun.client.ket.updatepreset.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdatePresetRequest
 * @Description 请求参数
 */
@Data
public class UpdatePresetRequest {
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
     * 模板名
     */
    @KsYunField(name = "Preset")
    private String Preset;

    /**
     * 模板描述
     */
    @KsYunField(name = "Description")
    private String Description;

    /**
     * 转码输出参数集
     */
    @KsYunField(name = "Output")
    private String Output;

    /**
     * 转码输出视频补充参数集
     */
    @KsYunField(name = "Video")
    private String Video;


}