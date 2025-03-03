package ksyun.client.kcs.renamesnapshot.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RenameSnapshotRequest
 * @Description 请求参数
 */
@Data
public class RenameSnapshotRequest {
    /**
     * 可用区   	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 备份名称。 	 支持6-64个中文或者英文字符，包括汉字，大小写字母，数字，下划线和中划线。
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 备份ID。
     */
    @KsYunField(name = "SnapshotId")
    private String SnapshotId;


}