package gitbucket.core.model

trait LocalHookComponent extends TemplateComponent { self: Profile =>

}

case class LocalHook(
  name: String,
  script: String
)
