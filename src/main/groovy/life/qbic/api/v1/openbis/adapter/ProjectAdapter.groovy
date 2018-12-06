package life.qbic.api.v1.openbis.adapter

interface ProjectAdapter {

    List<AttachmentAdapter> getAttachments()

    String getCode()

    String getDescription()

    List<ExperimentAdapter> getExperiments()

    ProjectFetchOptionsAdapter getFetchOptions()

    List<HistoryEntryAdapter> getHistory()

    ProjectIdentifierAdapter getIdentifier()

    PersonAdapter getLeader()

    Date getModificationDate()

    PersonAdapter getModifier()

    ProjectPermIdAdapter getPermId()

    Date getRegistrationDate()

    PersonAdapter getRegistrator()

    List<SampleAdapter> getSamples()

    SpaceAdapter getSpace()

}