package gitbucket.core.service

import gitbucket.core.model.LocalHook
import gitbucket.core.model.Profile._
import profile.simple._

trait LocalHookService {

  def getLocalHooks(owner: String, repository: String)(implicit s: Session): List[LocalHook] = {
    List(LocalHook.apply("a","a-1"),LocalHook.apply("b","b-1"),LocalHook.apply(owner,repository))
  }

}

object LocalHookService extends LocalHookService