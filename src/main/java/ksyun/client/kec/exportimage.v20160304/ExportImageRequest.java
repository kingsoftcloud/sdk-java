package ksyun.client.kec.exportimage.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ExportImageRequest
* @Description 请求参数
*/
@Data
public class ExportImageRequest{
    /**自定义镜像ID*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**镜像导出的目标bucket地址（需与镜像同地域，否则报错）*/
    @KsYunField(name="Ks3Bucket")
    private String Ks3Bucket;

    /**镜像导出后的文件名前缀，有效值：1-30个字符，支持文字、数字*/
    @KsYunField(name="ObjectName")
    private String ObjectName;

    /**镜像文件的导出格式，有效值：RAW、VHD、QCOW2、VDI和VMDK。未填，则默认为RAW*/
    @KsYunField(name="ImageExportType")
    private String ImageExportType;

}
