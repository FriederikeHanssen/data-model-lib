package life.qbic.api.v1.openbis.adapter

interface ExperimentAdapter {

    List<AttachmentAdapter> getAttachments()

    String getCode()

    List<DataSetAdapter> getDataSets()

    ExperimentFetchOptionsAdapter getFetchOptions()

    List<HistoryEntryAdapter> getHistory()

    ExperimentIdentifierAdapter getIdentifier()

    Map<java.lang.String, MaterialAdapter> getMaterialProperties()

    MaterialAdapter getMaterialProperty(java.lang.String propertyName)

    Date getModificationDate()

    PersonAdapter getModifier()

    ExperimentPermIdAdapter getPermId()

    ProjectAdapter getProject()

    Map<String, String> getProperties()

    String getProperty(java.lang.String propertyName)

    Date getRegistrationDate()

    PersonAdapter getRegistrator()

    List<SampleAdapter> getSamples()

    Set<TagAdapter> getTags()

    ExperimentTypeAdapter getType()

}