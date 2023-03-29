package ksyun.client.ebs.modifysnapshot.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifySnapshotRequest
* @Description 请求参数
*/
@Data
public class ModifySnapshotRequest{
    /**快照ID，长度36个字符，包括字母、数字、-*/
    @KsYunField(name="SnapshotId")
    private String SnapshotId;

    /**快照名称，长度2-50个字符，包括字母、数字、“-”、“_”，不能以auto开头*/
    @KsYunField(name="SnapshotName")
    private String SnapshotName;

    /**快照描述，长度0-128字符*/
    @KsYunField(name="SnapshotDesc")
    private String SnapshotDesc;


}