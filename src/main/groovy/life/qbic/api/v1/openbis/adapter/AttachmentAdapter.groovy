package life.qbic.api.v1.openbis.adapter

import life.qbic.api.v1.qbicobject.QbicAttachmentFetchOptionsV1
import life.qbic.api.v1.qbicobject.QbicAttachmentV1
import life.qbic.api.v1.qbicobject.QbicPersonV1

interface AttachmentAdapter {

    byte[] getContent()

    String getDescription()

    AttachmentFetchOptionsAdapter getFetchOptions()

    String getFileName()

    String getLatestVersionPermlink()

    String getPermlink()

    AttachmentAdapter getPreviousVersion()

    Date getRegistrationDate()

    PersonAdapter getRegistrator()

    String getTitle()

    Integer getVersion()

}
