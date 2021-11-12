def call(){
  def paramString = ""
  paramString += (env.project.name) ? "-Dproject.name=${env.project.name} " : ''
}
