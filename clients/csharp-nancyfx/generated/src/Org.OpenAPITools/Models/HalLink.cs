using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// HalLink
    /// </summary>
    public sealed class HalLink:  IEquatable<HalLink>
    { 
        /// <summary>
        /// Href
        /// </summary>
        public string Href { get; private set; }

        /// <summary>
        /// Templated
        /// </summary>
        public bool? Templated { get; private set; }

        /// <summary>
        /// Type
        /// </summary>
        public string Type { get; private set; }

        /// <summary>
        /// Deprecation
        /// </summary>
        public string Deprecation { get; private set; }

        /// <summary>
        /// Profile
        /// </summary>
        public string Profile { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Hreflang
        /// </summary>
        public string Hreflang { get; private set; }

        /// <summary>
        /// Name
        /// </summary>
        public string Name { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use HalLink.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public HalLink()
        {
        }

        private HalLink(string Href, bool? Templated, string Type, string Deprecation, string Profile, string Title, string Hreflang, string Name)
        {
            
            this.Href = Href;
            
            this.Templated = Templated;
            
            this.Type = Type;
            
            this.Deprecation = Deprecation;
            
            this.Profile = Profile;
            
            this.Title = Title;
            
            this.Hreflang = Hreflang;
            
            this.Name = Name;
            
        }

        /// <summary>
        /// Returns builder of HalLink.
        /// </summary>
        /// <returns>HalLinkBuilder</returns>
        public static HalLinkBuilder Builder()
        {
            return new HalLinkBuilder();
        }

        /// <summary>
        /// Returns HalLinkBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>HalLinkBuilder</returns>
        public HalLinkBuilder With()
        {
            return Builder()
                .Href(Href)
                .Templated(Templated)
                .Type(Type)
                .Deprecation(Deprecation)
                .Profile(Profile)
                .Title(Title)
                .Hreflang(Hreflang)
                .Name(Name);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(HalLink other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (HalLink.
        /// </summary>
        /// <param name="left">Compared (HalLink</param>
        /// <param name="right">Compared (HalLink</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (HalLink left, HalLink right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (HalLink.
        /// </summary>
        /// <param name="left">Compared (HalLink</param>
        /// <param name="right">Compared (HalLink</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (HalLink left, HalLink right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of HalLink.
        /// </summary>
        public sealed class HalLinkBuilder
        {
            private string _Href;
            private bool? _Templated;
            private string _Type;
            private string _Deprecation;
            private string _Profile;
            private string _Title;
            private string _Hreflang;
            private string _Name;

            internal HalLinkBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
                _Templated = false;
            }

            /// <summary>
            /// Sets value for HalLink.Href property.
            /// </summary>
            /// <param name="value">Href</param>
            public HalLinkBuilder Href(string value)
            {
                _Href = value;
                return this;
            }

            /// <summary>
            /// Sets value for HalLink.Templated property.
            /// </summary>
            /// <param name="value">Templated</param>
            public HalLinkBuilder Templated(bool? value)
            {
                _Templated = value;
                return this;
            }

            /// <summary>
            /// Sets value for HalLink.Type property.
            /// </summary>
            /// <param name="value">Type</param>
            public HalLinkBuilder Type(string value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for HalLink.Deprecation property.
            /// </summary>
            /// <param name="value">Deprecation</param>
            public HalLinkBuilder Deprecation(string value)
            {
                _Deprecation = value;
                return this;
            }

            /// <summary>
            /// Sets value for HalLink.Profile property.
            /// </summary>
            /// <param name="value">Profile</param>
            public HalLinkBuilder Profile(string value)
            {
                _Profile = value;
                return this;
            }

            /// <summary>
            /// Sets value for HalLink.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public HalLinkBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for HalLink.Hreflang property.
            /// </summary>
            /// <param name="value">Hreflang</param>
            public HalLinkBuilder Hreflang(string value)
            {
                _Hreflang = value;
                return this;
            }

            /// <summary>
            /// Sets value for HalLink.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public HalLinkBuilder Name(string value)
            {
                _Name = value;
                return this;
            }


            /// <summary>
            /// Builds instance of HalLink.
            /// </summary>
            /// <returns>HalLink</returns>
            public HalLink Build()
            {
                Validate();
                return new HalLink(
                    Href: _Href,
                    Templated: _Templated,
                    Type: _Type,
                    Deprecation: _Deprecation,
                    Profile: _Profile,
                    Title: _Title,
                    Hreflang: _Hreflang,
                    Name: _Name
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}