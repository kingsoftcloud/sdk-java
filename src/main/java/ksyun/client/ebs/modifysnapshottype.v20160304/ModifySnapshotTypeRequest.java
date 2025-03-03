package ksyun.client.ebs.modifysnapshottype.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname ModifySnapshotTypeRequest
 * @Description 请求参数
 */
@Data
public class ModifySnapshotTypeRequest {
    /***/
    @KsYunField(name = "SnapshotIds", type = 2)
    private List<String> SnapshotIdsList;

}