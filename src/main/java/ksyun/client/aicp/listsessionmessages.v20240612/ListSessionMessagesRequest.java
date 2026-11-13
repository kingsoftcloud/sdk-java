package ksyun.client.aicp.listsessionmessages.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListSessionMessagesRequest
* @Description 请求参数
*/
@Data
public class ListSessionMessagesRequest{
    /***/
    @KsYunField(name="AgentId")
    private String AgentId;

    /***/
    @KsYunField(name="SessionId")
    private String SessionId;

    /***/
    @KsYunField(name="AfterSeqId")
    private Integer AfterSeqId;

    /***/
    @KsYunField(name="BeforeSeqId")
    private Integer BeforeSeqId;

    /***/
    @KsYunField(name="CursorSource")
    private String CursorSource;

    /***/
    @KsYunField(name="HistoryEpoch")
    private String HistoryEpoch;

    /***/
    @KsYunField(name="SnapshotSeqId")
    private Integer SnapshotSeqId;

    /***/
    @KsYunField(name="Limit")
    private Integer Limit;

    /***/
    @KsYunField(name="IncludeReasoning")
    private Boolean IncludeReasoning;

    /***/
    @KsYunField(name="IncludeToolEvents")
    private Boolean IncludeToolEvents;

    /***/
    @KsYunField(name="IncludeAttachments")
    private Boolean IncludeAttachments;

}
