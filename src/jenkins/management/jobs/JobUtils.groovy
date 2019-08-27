import jenkins.model.Jenkins
import hudson.model.Job

public static Job getJob(String path) {
  return Jenkins.instance.getItem(path)
}
