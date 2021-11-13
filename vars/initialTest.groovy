def call(){
  def paramString = ""
  paramString += (env.app_name) ? "-Dapp.name=${env.app_name} " : ""
  paramString += (env.src_dir) ? "-Dsrc.dir=${env.src_dir} " : ""
  paramString += (env.build_dir) ? "-Dbuild.dir=${env.build_dir} " : ""
  paramString += (env.classes_dir) ? "-Dclasses.dir=${env.classes_dir} " : ""
  paramString += (env.etc_dir) ? "-Detc.dir=${env.etc_dir} " : ""
    
  paramString 
}
