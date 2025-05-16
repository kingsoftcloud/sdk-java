package ksyun.client.ebs.deletesnapshot.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteSnapshotRequest
 * @Description 请求参数
 */
@Data
public class DeleteSnapshotRequest {
    /**
     * 快照ID
     * 长度36个字符，包括字母、数字、-
     */
    @KsYunField(name = "SnapshotId")
    private String SnapshotId;

}