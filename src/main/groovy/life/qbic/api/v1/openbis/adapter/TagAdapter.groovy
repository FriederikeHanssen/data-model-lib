package life.qbic.api.v1.openbis.adapter

//TODO add setters
interface TagAdapter {

    String getCode()

    List<DataSetAdapter> getDataSets()

    List<ExperimentAdapter> getExperiments()

    TagFetchOptionsAdapter getFetchOptions()

    List<MaterialAdapter> getMaterials()

    PersonAdapter getOwner()

    TagPermIdAdapter getPermId()

    Date getRegistrationDate()

    List<SampleAdapter> getSamples()

    boolean isPrivate()
}