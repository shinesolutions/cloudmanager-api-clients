part of openapi.api;

class RepositoryBranch {
  /* Identifier of the program. Unique within the space */
  String programId = null;
  /* Identifier of the repository */
  int repositoryId = null;
  /* Name of the branch */
  String name = null;
  
  RepositoryBranchLinks links = null;
  RepositoryBranch();

  @override
  String toString() {
    return 'RepositoryBranch[programId=$programId, repositoryId=$repositoryId, name=$name, links=$links, ]';
  }

  RepositoryBranch.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    programId = json['programId'];
    repositoryId = json['repositoryId'];
    name = json['name'];
    links = (json['_links'] == null) ?
      null :
      RepositoryBranchLinks.fromJson(json['_links']);
  }

  Map<String, dynamic> toJson() {
    Map <String, dynamic> json = {};
    if (programId != null)
      json['programId'] = programId;
    if (repositoryId != null)
      json['repositoryId'] = repositoryId;
    if (name != null)
      json['name'] = name;
    if (links != null)
      json['_links'] = links;
    return json;
  }

  static List<RepositoryBranch> listFromJson(List<dynamic> json) {
    return json == null ? List<RepositoryBranch>() : json.map((value) => RepositoryBranch.fromJson(value)).toList();
  }

  static Map<String, RepositoryBranch> mapFromJson(Map<String, dynamic> json) {
    var map = Map<String, RepositoryBranch>();
    if (json != null && json.isNotEmpty) {
      json.forEach((String key, dynamic value) => map[key] = RepositoryBranch.fromJson(value));
    }
    return map;
  }

  // maps a json object with a list of RepositoryBranch-objects as value to a dart map
  static Map<String, List<RepositoryBranch>> mapListFromJson(Map<String, dynamic> json) {
    var map = Map<String, List<RepositoryBranch>>();
     if (json != null && json.isNotEmpty) {
       json.forEach((String key, dynamic value) {
         map[key] = RepositoryBranch.listFromJson(value);
       });
     }
     return map;
  }
}

