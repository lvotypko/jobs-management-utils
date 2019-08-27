import jenkins.model.Jenkins

public boolean isCalledFromConfigurator(){
  if (! "$JOB_NAME".equals('job-configurator')) {
    println("This features can be called only from job configurator")
    throw new IllegalStateException("Feature should be used only by job configurator")
  }
}
